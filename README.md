# Heavy-Evil
Java Application, Web Forum and Game Framework meant to be easily understood.

SDK's currently used in project development. 

Java SE 8/JDK 8/JRE 8 but was originally built on JDK 1.6, as far as I remember once you install the JDK eclipse will detect it on your system. As with the other libraries you just need to add the external .jar files to a created library from after extracting the .zip file. 

JOGL 2.3(includes Gluegen, JOAL and JOCL, and all current OpenGL native libraries),

MySQL Connector/J 5.1

Java3D 1.6 - An abstraction and architecture library meant to be used along side JOGL to scale online multiplayer games more easily. Java 8 has Java3D already installed but is heavily outdated on many Mac OS X versions. Java3D works alongside jogl.jar and gluegen-rt.jar in /Library/Java, but they may be outdated. I'm still working on it. I actually just noticed all of the damn .jars that I wasn't even using in the jogamp release. Hopefully I will figure it out soon but until then my ObjectLoader class is not compiling.  

Automatic installers will add j3dcore.jar, j3dutils.jar and vectormath.jar in System/Library/Java/Extensions and System/Library/Java/JavaVirtualMachine/jre/lib/ext. I've tried removed all of the old jni files, replaced them, replaced all the Java3D files with the J3D 1.6 files and am still getting the errors below, so I'm not sure how much they really play a role. To edit the .jar file paths, right click on your Java library and select Configure Build Path, Libraries, click Edit, Installed JRE's(User Libraries if it's not a JRE), select one, click edit, and there you can select and remove duplicate or unwanted library entries or to add the new entries. You also may be able to do the same thing by clicking Run>Run Configuration, or Preferences>Java>Installed JRE's.

I added a snapshot in my file uploads to show you what your library should look like and which .jar files to include if you are unable to compile the other files in the project. They seem to only work with a specific access privelage in /System/Library and /Libary .jars are not recognized I believe.

You can traverse the file system by opening your command shell and typing "cd /", followed by "cd System," etc. The command "ls" will list the contents of the folder. 

For Windows and Linux the tutorial seems to be to add the .bin file under native libraries under user libraries but I honestly couldn't tell you. I am using Mac OS X Lion version 10.7.5 with 4 GB's of RAM and stock video RAM. It takes a few minutes to load a million hairs in Blender, which I use to edit my object models. I would recommend Blender or AutoDesk Maya. You can download .obj files online or there are many other formats. The material .mtl file holds the texture data and has to be accessed some other way. 

I currently use Eclipse Luna IDE which I would highly recommend. From your project build settings(right click on project, click Build Path/Configure Build Path/Library pane/Add Library/User Library, name it, and then Add External jars to that) and for this project, create an Images folder. The background of the login window streams a live website url. You can change it but it currently is limited as to what pages it can render.   

I use Amazon Web Services RDS MySQL Database and an EC2 instance for Security Groups. Just allow incoming and outgoing TCP connections to "My IP Address"(which can change periodically) through port 3306. Uncheck the Multi-AZ deployment to stay on the free tier. My costs are about 50 cents a month.  

This project is an open source game template for developers who want to build a fully functional OpenGL and Java based application that's easily portable to other systems. This project mostly uses Swing for it's windowing toolkit. The OpenGL functions can be converted directly to C# or C++ syntax within seconds by using a simple replace all text function within Eclipse, changing "GL2.GL_METHOD_EXAMPLE to the original GL_METHOD_EXAMPLE." OpenGL is widely used in the console industry and easily translates to DirectX and graphics standards allow for easy cross-project development on any gaming console whether DirectX or OpenGL, the two leading graphics libraries. In the future I plan to migrate the code to the Hololens when it's software development kit becomes available, as it's currently in early development phases as well as the ALICE Bot. 

  -Removed Maven from project currently. If you haven't installed or used Maven before ignore this. When updating the pom.xml file it corrupted the entire project. To remove it, right click on the project and then Maven-->Disable Maven nature, then you will need to edit in your Build Path, go to the sources tab and remove the two target output folders, renaming the output folder to Heavy Evil/bin and hit okay. Then you will be allowed to delete the target folder, which reduplicates itself after delete and cannot be deleted from within the system. An incorrect build will corrupt the entire project. XML does help but I will probably be waiting until later, and at first it helped but after some changes to the code it no longer seems to effect anything. 
  
  -Removed SwingWorker multithreading for the moment and put my sql connection in the main JDial.java class because I am still practicing multithreading.
  
  My website heavyevil.gq is not yet connected to this project but was registered on dot.tk or freedomains.com and you simply take the NS Records from your DNS management options in dot.tk and put them into an AWS Hosted Zone on amazon.aws.com, allowing all incoming connections. MySQL only allows connections through port 3306 but you can use the same EC2 instance and Security group and add the rules. Your HTML, CSS etc. can be stored in S3 under the file name that you want your website to be called(www.website.com), and I will eventually be looking into OpsWorks for JSP, and Elastic Beanstalk to host an administration version of my application most likely for later use with the website. Spring Framework also may have their own cloud if you want to look into that route or many others such as Google Cloud, Heliohost etc. I use Firefox add-ons FireBug, FireDiff and Fireformat to edit the website live. They allow you to export the finished page which you then use to replace the older version on S3.

