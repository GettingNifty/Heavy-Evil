# Heavy-Evil
Java Application, Web Forum and Game Framework meant to be easily understood.

SDK's currently used in project development. 

Java SE 8/JDK 8/JRE 8 but was originally built on JDK 1.6, as far as I remember once you install the JDK eclipse will detect it on your system. As with the other libraries you just need to add the external .jar files to a created library from after extracting the .zip file. 

JOGL 2.3(includes Gluegen, JOAL and JOCL, and all current OpenGL methods),

MySQL Connector/J 5.1

Java3D 1.6 - An abstraction and architecture library meant to be used along side JOGL to scale online multiplayer games more easily. Java 8 has Java3D already installed but is heavily outdated on many Mac OS X versions. Java3D works alongside jogl.jar and gluegen-rt.jar in /Library/Java. Automatic installers will add j3dcore.jar, j3dutils.jar and vectormath.jar in System/Library/Java/Extensions and System/Library/Java/JavaVirtualMachine/jre/lib/ext. I've removed all of the jni files, replaced them, replaced all the Java3D files with the J3D 1.6 files and am still getting the errors below. The problem could simply be my code because I'm new to this library. Right click on your Java library and select Configure Build Path, Libraries, click Edit, Installed JRE's, select one, click edit, and there you can select and remove duplicate library entries or add the new entries. You also may be able to do the same thing by clicking Run>Run Configuration, or Preferences>Java>Installed JRE's I added a snapshot in my file uploads to show you what your library should look like and which .jar files to include. 

From what I've read on stackoverflow I need to edit the class path or environment variables or vm arguments, but I've done all of that too and still nothing. I'll update when I figure it out. You can see some of my graphics scenes at facebook.com/gettingnifty. I'm currently getting a ModelComponent NoClassDefFound error but I have gotten the errors below when trying to use ObjectFile fully configured under Java SE 8.

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
	
and Java SE 6

Exception in thread "main" java.lang.UnsupportedClassVersionError: hEvil/ObjectLoader : Unsupported major.minor version 52.0
	at java.lang.ClassLoader.defineClass1(Native Method)
	at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
	at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
	at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
	at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
	at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:301)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:247)


You can traverse the file system by typing "cd /", followed by "cd System," etc. The command "ls" will list the contents of the folder. 

For Windows and Linux the tutorial seems to be to add the .bin file under native libraries under user libraries. I am using Mac OS X Lion version 10.7.5 with 4 GB's of RAM and stock video RAM. It takes a few minutes to load a million hairs in Blender, which I use to edit my object models. I would recommend Blender or AutoDesk Maya. 

For beginners, I currently use Eclipse Luna IDE which I would recommend. You only need to add the external jar files from the JRE/JDK of your choice. You can develop 1.8 programs on 1.6 or Blackberry, Android JRE's, etc.. From your project build settings(right click on project, click Build Path/Configure Build Path/Library pane/Add Library/User Library, name it, and then Add External jars to that) and for this project, create an Images folder. The background of the login window streams a live website url. You can change it but it currently is limited as to what pages it can render.   

I use Amazon Web Services RDS MySQL Database and an EC2 instance for Security Groups on the free tier. Just allow incoming and outgoing TCP connections to "My IP Address"(which can change periodically) through port 3306. Uncheck the Multi-AZ deployment to stay on the free tier. My costs are about 5 dollars a month.  

This project is an open source game template for developers who want to build a fully functional OpenGL and Java based application that's easily portable to other systems. This project mostly uses Swing for it's windowing toolkit. Object models can be easily created with 3rd party software like AutoDesk Maya or Blender. The OpenGL functions can be converted directly to C# or C++ syntax within seconds by using a simple replace all text function within Eclipse, changing "GL2.GL_METHOD_EXAMPLE to the original GL_METHOD_EXAMPLE." OpenGL is widely used in the console industry and easily translates to DirectX and graphics standards allow for easy cross-project development on any gaming console. In the future I plan to migrate the code to the Hololens when it's software development kit becomes available, as it's currently in early development phases as well as the ALICE Bot most likely using node.js api or there may be a JDK. 

  -Removed Maven from project currently. If you haven't installed or used Maven before ignore this. When updating the pom.xml file it corrupted the entire project. To remove it, right click on the project and then Maven-->Disable Maven nature, then you will need to edit in your Build Path, go to the sources tab and remove the two target output folders, renaming the output folder to Heavy Evil/bin and hit okay. Then you will be allowed to delete the target folder, which reduplicates itself after delete and cannot be deleted from within the system. An incorrect build will corrupt the entire project. XML does help but I will probably be waiting until later, and at first it helped but after some changes to the code it no longer seems to effect anything. 
  
  -Removed SwingWorker for the moment and put my sql connection in the main file because I am still practicing multithreading.
  
  My website heavyevil.gq is not yet connected to this project but was registered on dot.tk or freedomains.com and you simply take the NS Records from your DNS management options in dot.tk and put them into an AWS Hosted Zone, allowing all connections. MySQL only allows connections through port 3306 so you can use the same EC2 instance and Security group. Your HTML, CSS etc. can be stored in S3 under the file name that you want your website to be called, and I will eventually be looking into OpsWorks for JSP, and Elastic Beanstalk to host an administration version of my application most likely for later use with the website. Spring Framework also may have their own cloud if you want to look into that route or many others such as Google Cloud, Heliohost etc. I use Firefox add-ons FireBug, FireDiff and Fireformat to edit the website live. 

