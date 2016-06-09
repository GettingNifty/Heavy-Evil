# Heavy-Evil
Application/Web Forum/MMORPG Template


SDK's currently used in project development.

JOGL 2.3,
MySQL,
Spring 4.4,
JRE and JDK 1.8 System Library(Java SE 8),
JSoup1.8.3,
Maven 3+

  You're going to need to install the JDK's and use Maven SDK exclusively via the command line using cd terminal or linux command prompt calls to increase performance later in the development process. The current pom.xml file should be in your package, along with the external jars, and an Images folder, where the names correspond to the code. The .java files lose stability when the .jar file needs to be created, until the recent introduction of Maven, which maps the program in someway via xml documentation, similar to Gradle which is how Android applications are built. 

  The project is meant to be a game but also an open source template for Java developers who want to build a fully functional OpenGL based application, that will eventually be connected to a forum using Java Servlets and JSP. Portable to DirectX, I plan to also incorporate Microsofts Kinect technology as well as the ALICE Bot using node.js api. 

Major Updates:

-Removed Maven from project. I would identify it as a rogue virus. To remove it, right click on the project and then Maven-->Disable Maven nature, then you will need to edit in your Build Path, go to the sources tab and remove the target output folders, renaming the output folder to Heavy Evil/bin and hit okay. Then you will be allowed to delete the target folder, which reduplicates itself after delete and cannot be deleted from within the system. An incorrect build will corrupt all of your files. 
