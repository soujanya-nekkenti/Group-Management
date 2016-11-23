# Group-Management
==================================================
### Domain Description:

Students of a school are divided into classes, usually one or more per grade level. Each student studies a set of subjects, some common (e.g math, geography) and some individual chosen (e.g. foreign languages). Students are then organized into groups where teachers hold lessons in those subjects. A group can contain more than one subject (e.g physics and chemistry).
In big schools with many students there can be multiple classes per grade level where as in smaller schools, a class might span over multiple grade levels. This also affects groups as they are related to classes as well as grade levels. Groups may have both a minimum and a maximum number of students that are required or allowed. If the capacity of a group is reached or number of required students isn’t reached, those student are unplaced. Students that are candidates for more than one group in a subject are also left unplaced. The headmaster should be informed of unplaced students to be able to take further action.

=========================================================
### Prerequisites:
 Java 8
 Maven project (Maven 4.0.0)
 Unit tests
 Eclipse IDE

===========================================================
### Getting up and running:
1. Download the zip file and unzip the contents
2. Open Eclipse
2. File --> Import --> Maven --> Existing Maven projects --> Browse Root Directory --> Finish
3. Run each test case and verify.

=============================================================
### Features Implemented:

* Primary features (implemented):
 Data model of students, classes, subjects and groups.
 Population of existing groups with students based on the subjects they are supposed to read and what classes they belong to.
o The implementation must support both big and small school, and everything in between.

* Secondary features (implemented):
 Support minimum and maximum number of students in a group.
 Report unplaced students.
=============================================================
### Features needed to implemented(still in progress)
* Tertiary features:
 Support group templates, with maximum number of groups allowed, to have population create the groups needed.
