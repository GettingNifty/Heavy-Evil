# Heavy-Evil
Java Application, Web Forum and Game Framework meant to be easily understood.

SDK's currently used in project development. 

JRE and JDK 1.8 System Library(Java SE 8) but was originally built on JDK and RE 1.6,

JOGL 2.3(includes Gluegen, JOAL and JOCL, and all current OpenGL methods),

MySQL Connector/J 5.1,

Spring 4.4(for much later stages, meant to be used when hosting the game your own servers, for instance rather than using hosting websites),

JSoup 1.8.3(currently unused but for HTML parsing)

Java3D 1.5.2 - An abstraction library meant to be used along side JOGL to scale online multiplayer games more easily. Java 8 has Java3D already installed but is heavily outdated on many Mac OS X versions, so basically the installers for the Operating System Runtime Environment create j3dcore.jar, j3dutils.jar and vectormath.jar in System/Library/Java/Extensions and System/Library/Java/JavaVirtualMachine/jre/lib/ext and when adding the external jars in the eclipse execution environment these files conflict with the old files with identical names. Right click on your Java library and select Configure Build Path, Libraries, click Edit, Installed JRE's, select one, click edit, and there you can select and remove duplicate class entries. I'm assuming the file location doesn't matter as much as the file itself as once you're done many will only be alias or copies. Make sure to restart eclipse and your computer. You also may have to manually replace the files in the links above. Currently I have the Java 3D 1.5.2 Library with duplicate files as my Java 8 library because that is how JOGL is setup after install and it works perfectly. You can see some of my scenes at facebook.com/gettingnifty. I'm going to try Java 3D 1.6 again to see if that fixes the issues. I currently have narrowed it down to the following error

Exception in thread "main" java.lang.NoClassDefFoundError: com/sun/opengl/util/BufferUtil
	at javax.media.j3d.JoglPipeline.<clinit>(JoglPipeline.java:5048)
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:264)
	at javax.media.j3d.Pipeline$1.run(Pipeline.java:162)
	at java.security.AccessController.doPrivileged(Native Method)
	at javax.media.j3d.Pipeline.createPipeline(Pipeline.java:157)
	at javax.media.j3d.MasterControl.loadLibraries(MasterControl.java:965)
	at javax.media.j3d.VirtualUniverse.<clinit>(VirtualUniverse.java:299)
	at hEvil.ObjectLoader.<init>(ObjectLoader.java:29)
	at hEvil.ObjectLoader.main(ObjectLoader.java:64)

You can traverse the file system by typing "cd /", followed by "cd System," etc. The command "ls" will list the contents of the folder. 

For Windows and Linux the tutorial seems to be to add the .bin file under native libraries under user libraries. I am using Mac OS X Lion version 10.7.5 with 4 GB's of RAM and stock video RAM. It takes a few minutes to load a million hairs in Blender, which I use to edit my object models. I would recommend Blender or AutoDesk Maya. 

For beginners, I currently use Eclipse Luna IDE which I would recommend. You only need to add the external jar files from the JDK of your choice and possibly user a JRE if you want to develop 1.8 programs on 1.6 or Blackberry, Android JRE's. From your project build settings(right click on project, click Build Path/Configure Build Path/Library pane/Add Library/User Library, name it, and then Add External jars to that) and create an Images folder within the project for your image sources. I will also being storing my object models in the Images folder. The background of the login window streams a live website url. You can change it in the code, but it currently is limited as to what pages it can render.   

I use Amazon Web Services RDS MySQL Database and an EC2 instance for Security Groups on the free tier. Just allow incoming and outgoing TCP connections to "My IP Address"(which can change periodically) through port 3306. Uncheck the Multi-AZ deployment to stay on the free tier. My costs are about 5 dollars a month.  

This project is an open source game template for developers who want to build a fully functional OpenGL based application that's easily portable to other systems. Everything has it's own windowing toolkit. This project uses Swing and AWT. The graphics can be saved and converted in many different file formats. Models can be easily created with 3rd party software like AutoDesk Maya or Blender. The OpenGL functions can be converted directly to C# or C++ syntax within seconds by using a simple replace all text function within Eclipse, changing "GL2.GL_METHOD_EXAMPLE to the original GL_METHOD_EXAMPLE." OpenGL is widely used in the console industry and easily translates to DirectX and graphics standards allow for easy cross-project development on any gaming console. In the future I plan to migrate the code to the Hololens when it's software development kit becomes available, as it's currently in early development phases as well as the ALICE Bot most likely using node.js api or there may be a JDK. 

  -Removed Maven from project currently. If you haven't installed or used Maven before ignore this. It showed instability when updating the pom.xml file and corrupted the entire project. To remove it, right click on the project and then Maven-->Disable Maven nature, then you will need to edit in your Build Path, go to the sources tab and remove the two target output folders, renaming the output folder to Heavy Evil/bin and hit okay. Then you will be allowed to delete the target folder, which reduplicates itself after delete and cannot be deleted from within the system. An incorrect build will corrupt the entire project. XML does help but I will probably be waiting until later, and at first it helped but after some changes to the code it no longer seems to effect anything. 
  
  -Removed SwingWorker for the moment and put my sql connection in the main file because I am still practicing multithreading.
  
  My website heavyevil.gq is not yet connected to this project but was registered on dot.tk or freedomains.com and you simply take the NS Records from your DNS management options in dot.tk and put them into an AWS Hosted Zone, allowing all connections. MySQL only allows connections through port 3306 so you can use the same EC2 instance and Security group. Your HTML, CSS etc. can be stored in S3 under the file name that you want your website to be called, and I will eventually be looking into OpsWorks for JSP, and Elastic Beanstalk to host an administration version of my application most likely for later use with the website. Spring Framework also may have their own cloud if you want to look into that route or many others such as Google Cloud, Heliohost etc. I use Firefox add-ons FireBug, FireDiff and Fireformat to edit the website live. 

