



/*
 * “Time is the wisest counselor of all.” — Pericles

When dealing with software it is important to keep track of the right date and time, in domains like fintech and medical this is a critical element. When developing applications developers always tend to focus on the business problem when developing the application without re-inventing the wheel.

In Java to deal with these Date and Time problems to the precious, it has few prebuilt libraries we can use before Java 8, those are,

java.util.Date
java.util.Calendar
java.text.SimpleDateFormat
java.util.TimeZone
Those two legacy API came with few issues,

Date class should represent a date but it also represents the minutes hours and seconds as well. as an example
Date now = new Date();
Output will be : Tue May 04 08:17:05 UTC 2021
And if looks closely Date does not have an associated time zone it picks up the default timezone of the server/pc it is running. This would be an issue if users are residing somewhere else geographically but the server is hosted in another time zone.

2. The classes used a zero index-based approach to represents the months, this might make confusions some times

Calendar calendar = Calendar.getInstance();
System.out.println(calendar.JANUARY);
Output will be : 0
3. And another class which used in dealing with the Date has a time zone since this is used in JDBC and getting data back from the database and convert to Java Date format causing issues.

To deal with those issues and fix them from Java 8, it came with the new set of API for Date and Time those are,

java.time.LocalDate — This represents only the time according to the ISO calendar.
java.time.LocalTime — This represents only the time in a human-readable manner.
java.time.LocalDateTime — Both the Date and Time without having a time zone will be handled here. This is a combination of LocalDate and LocalTime.
java.time.ZonedDateTime — LocalDateTime combines with the time zone provided using ZoneId class.
java.time.OffsetTime — Handles time with a corresponding time zone offset from Greenwich/UTC, without a time zone ID.
java.time.OffsetDateTime — Handles a date and time with a corresponding time zone offset from Greenwich/UTC, without a time zone ID.
java.time.Clock — Provides access to the current instant, date, and time in any given time zone.
java.time.Instant — represents the start of a nanosecond on the timeline and useful for generating a timestamp to represent machine time
java.time.Duration — Difference between two instants and measured in seconds or nanoseconds and does not use date-based constructs such as years, months, and days, though the class provides methods that convert to days, hours, and minutes.
java.time.Period — To define the difference between dates in date-based values (years, months, days).
java.time.ZoneId — specifies a time zone identifier and provides rules for converting between an Instant and a LocalDateTime.
java.time.ZoneOffset — Specifies a time zone offset from Greenwich/UTC.
Let’s find out how each one of these works practically. There are few ways we can initialize Date and Time objects.
 */