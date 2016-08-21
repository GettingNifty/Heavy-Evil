# Heavy-Evil
Java Application, Web Forum and Game Framework

SDK's currently used in project development. 

Java SE 8/JDK 1.8/JRE 8 but was originally built on JDK 1.6 and still compiles on both. 

JOGL 2.3(includes Gluegen, JOAL and JOCL, and all current OpenGL native libraries),

MySQL Connector/J 5.1

Spring 4.4(currently unused)for server hosting rather than using a hosting website

JSoup 1.8.3(currently unused)for html parsing

Java3D 1.6 - An abstraction and architecture library meant to be used along side JOGL to scale online multiplayer games more easily. Java 8 has Java3D already installed but is heavily outdated on many Mac OS X versions. You should download the newest release of both Java3D and JOGL from the Jogamp website to get it working correctly. There is no need to set native paths as the jar files contain this information but must be placed in /LibarJava3D works alongside JOGL.

To add a new JRE, download the JDK which includes the JRE and developer tools as well. You can download the JRE if you want. I still have yet to learn debugging. Click on Eclipse>Preferences>Java>Installed JRE's>Add after unpacking the tar.gz format file from the Oracle website. In my case my JRE's(JDK's) for eclipse are installed under /System/Library/Java/JavaVirtualMachines, so this is where you would copy the unpacked folder to. To have Eclipse load the correct .jar files automatically simply select the following file path and name it whatever you want. For instance I recently downloaded the latest JDK, installed it on my machine, and copied the entire folder to /System/Library/Java/JavaVirtualMachines where I keep my other JRE/JDK's. 

So the following path should be selected and named from within Eclipse Installed JRE's>Add

/System/Library/Java/JavaVirtualMachines/1.8.0_102.jdk/Contents/Home/jre

or if it's a JRE it will be the /Home folder.

Now the .jar files will be loaded automatically.

The .dmg format is only an installer for your OS, but you can still copy the .jdk file in /Library/Java/JavaVirtualMachines to the location above. The automatic Java update installer in Mac OS X System Preferences>Java will also update/install to this location, I believe, but it may be installed elsewhere as I removed the files and Java still said it had the latest update. I've included a screen shot to show you what JOGL/Jogamp/Java3D files to copy into the aforementioned directory. All other files can be removed beforehand. Make sure you have the latest releases for more ease. 

This is the tutorial I followed, without doing any native linking.

https://jogamp.org/wiki/index.php/Java3D_FAQ

You can traverse the file system by opening your command shell and typing "cd /", followed by "cd System," etc. The command "ls" will list the contents of the folder. You can go backwards by typing "cd ../". Type "open JavaVirtualMachines" to open the folder in Finder once you have gotten to "cd Java" where the file is located and copy the new JRE/JDK into it, so that you can use the JVM under System/Library to store your JRE's and switch between different versions.

I am using Mac OS X Lion version 10.7.5 with 4 GB's of RAM and stock VRAM. It takes a few minutes to load a million hairs in Blender, which I use to edit my object models. I would recommend Blender or AutoDesk Maya. You can download .obj files online or there are many other formats. The material .mtl file holds the texture data and has to be accessed some other way. 

I currently use Eclipse Luna IDE which I would highly recommend. From your project build settings(right click on project, click Build Path/Configure Build Path/Library pane/Add Library/User Library, name it, and then Add External jars to that) and for this project, create an Images folder. The background of the login window streams a live website url. You can change it but it currently is limited as to what pages it can render.   

I use Amazon Web Services RDS MySQL Database and an EC2 instance for Security Groups. Just allow incoming and outgoing TCP connections to "My IP Address"(which can change periodically) through port 3306. Uncheck the Multi-AZ deployment to stay on the free tier. My costs are about 50 cents a month.  

This project is an open source game template for developers who want to build a fully functional OpenGL and Java based application that's easily portable to other systems. This project mostly uses Swing for it's windowing toolkit. The OpenGL functions can be converted directly to C# or C++ syntax within seconds by using a simple replace all text function within Eclipse, changing "GL2.GL_METHOD_EXAMPLE to the original GL_METHOD_EXAMPLE." OpenGL is widely used in the console industry and easily translates to DirectX and graphics standards allow for easy cross-project development on any gaming console whether DirectX or OpenGL, the two leading graphics libraries. In the future I plan to migrate the code to the Hololens when it's software development kit becomes available, as it's currently in early development phases as well as the ALICE Bot. 

  -Removed Maven from project currently. If you haven't installed or used Maven before ignore this. When updating the pom.xml file it corrupted the entire project. To remove it, right click on the project and then Maven-->Disable Maven nature, then you will need to edit in your Build Path, go to the sources tab and remove the two target output folders, renaming the output folder to Heavy Evil/bin and hit okay. Then you will be allowed to delete the target folder, which reduplicates itself after delete and cannot be deleted from within the system. An incorrect build will corrupt the entire project. XML does help but I will probably be waiting until later, and at first it helped but after some changes to the code it no longer seems to effect anything. 
  
  -Removed SwingWorker multithreading for the moment and put my sql connection in the main JDial.java class because I am still practicing multithreading.
  
  My website heavyevil.gq is not yet connected to this project but was registered on dot.tk or freedomains.com and you simply take the NS Records from your DNS management options in dot.tk and put them into an AWS Hosted Zone on amazon.aws.com, allowing all incoming connections. MySQL only allows connections through port 3306 but you can use the same EC2 instance and Security group and add the rules. Your HTML, CSS etc. can be stored in S3 under the file name that you want your website to be called(www.website.com), and I will eventually be looking into OpsWorks for JSP, and Elastic Beanstalk to host an administration version of my application most likely for later use with the website. Spring Framework also may have their own cloud if you want to look into that route or many others such as Google Cloud, Heliohost etc. I use Firefox add-ons FireBug, FireDiff and Fireformat to edit the website live. They allow you to export the finished page which you then use to replace the older version on S3.

