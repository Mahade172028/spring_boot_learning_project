package com.example.calendergenerator;

import net.fortuna.ical4j.data.CalendarOutputter;
import net.fortuna.ical4j.model.*;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.property.*;
import net.fortuna.ical4j.util.RandomUidGenerator;
import net.fortuna.ical4j.util.UidGenerator;
import net.fortuna.ical4j.validate.ValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.TimeZone;

@RestController
public class Controller {


        @GetMapping(path = "/generate-calendar")
        public void generateCalenderFile() throws ParseException {

            /* Event start and end time in milliseconds */
            Long startDateTimeInMillis = 18159562456000L;
            Long endDateTimeInMillis = 1615959875000L;

            java.util.Calendar calendarStartTime = new GregorianCalendar();
            calendarStartTime.setTimeInMillis(startDateTimeInMillis);

            // Time zone info
            TimeZone tz = calendarStartTime.getTimeZone();
            ZoneId zid = tz.toZoneId();


            /* Generate unique identifier */
            UidGenerator ug = new RandomUidGenerator();
            Uid uid = ug.generateUid();

            /* Create the event */
            String eventSummary = "Happy New Year";
            LocalDateTime start = LocalDateTime.ofInstant(calendarStartTime.toInstant(), zid);
            LocalDateTime end = LocalDateTime.ofInstant(Instant.
                    ofEpochMilli(endDateTimeInMillis), zid);
            TimeZoneRegistry tzReg = TimeZoneRegistryFactory.getInstance().createRegistry();
            TimeZone timezone = tzReg.getTimeZone("Europe/London");
            VEvent event = new VEvent();
            PropertyList<Property> eventProps = event.getProperties();
            eventProps.add(uid);
            eventProps.add(new DtStart(new DateTime(startDateTimeInMillis)));
            eventProps.add(new Duration(java.time.Duration.ofHours(1)));
            eventProps.add(new Summary("The title of the event"));
            eventProps.add(new Description("Some longer description of the event."));


            /* Create calendar */
            Calendar calendar = new Calendar();
            calendar.getProperties().add(new ProdId("-//Ben Fortuna//iCal4j 1.0//EN"));
            calendar.getProperties().add(Version.VERSION_2_0);
            calendar.getProperties().add(CalScale.GREGORIAN);

            /* Add event to calendar */
            calendar.getComponents().add(event);
            String filePath = "mymeeting.ics";
            FileOutputStream fout = null;
            try {

                fout = new FileOutputStream(filePath);
                CalendarOutputter outputter = new CalendarOutputter();
                outputter.output(calendar, fout);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (ValidationException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fout != null) {
                    try {
                        fout.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }


//            byte[] calendarByte = calendar.toString().getBytes();
//            Resource resource = new ByteArrayResource(calendarByte);
//
//            HttpHeaders header = new HttpHeaders();
//            header.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=mycalendar.ics");
//            header.add("Cache-Control", "no-cache, no-store, must-revalidate");
//            header.add("Pragma", "no-cache");
//            header.add("Expires", "0");
//
//            return ResponseEntity.ok().headers(header).contentType(MediaType.
//                            APPLICATION_OCTET_STREAM)
//                    .body(resource);
        }

}