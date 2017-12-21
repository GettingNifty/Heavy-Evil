# Heavy-Evil

[![Join the chat at https://gitter.im/Heavy-Evil/Lobby](https://badges.gitter.im/Heavy-Evil/Lobby.svg)](https://gitter.im/Heavy-Evil/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
Java Application, Web Forum and Game Framework

SDK's currently used in project development. 

Java SE 9, Java SE 8, Java SE 6  

Jogamp JOGL 2.3.2(includes Gluegen, JOAL and JOCL, and all current OpenGL native libraries),

MySQL Connector/J 5.1

Spring 4.4(currently unused)for server hosting rather than using a hosting website

JSoup 1.8.3(currently unused)for html parsing

Jogamp Java3D 1.6 - An abstraction and architecture library meant to be used along side JOGL to scale games more easily. Java 8 has Java3D already installed but is heavily outdated in all JRE's even up to SE 9. You should download the newest release of both Java3D and JOGL from the Jogamp website to get it working correctly. There is no need to set native paths as the jar files contain this information but must be placed in /Library/Java/Extensions. The URL for the newest version of Java 3D is listed below. Please follow my uploaded screenshots. The native dylibs have changed but simply keep the dylibs and the .jar files listed in the screenshots. On newer versions of Mac you have to turn on FileVault to get Recovery access, hold Command+R at boot up and open the terminal application, using csrutil disable command and then a restart to allow you to copy the necessary open gl(JOGL) and java 3d .jar files into your cd /System/Library/Java/Extensions folder. 

Here are a few video links to scenes I am creating...

https://www.facebook.com/gettingnifty/videos/vb.1503244128/10209612469617567/?type=2&video_source=user_video_tab

https://www.facebook.com/gettingnifty/videos/vb.1503244128/10209494139979400/?type=2&theater

https://www.facebook.com/gettingnifty/videos/vb.1503244128/10210407875742223/?type=2&video_source=user_video_tab

https://www.facebook.com/gettingnifty/videos/vb.1503244128/10209542840756889/?type=2&theater

https://www.facebook.com/gettingnifty/videos/vb.1503244128/10210407875742223/?type=2&video_source=user_video_tab

To add a new JRE, download the JDK which includes the JRE and developer tools as well. You can download the JRE if you want. I still have yet to learn debugging. Click on Eclipse>Preferences>Java>Installed JRE's>Add after unpacking the tar.gz format file from the Oracle website. In my case my JRE's(JDK's) for eclipse are installed under /System/Library/Java/JavaVirtualMachines, so this is where you would copy the unpacked folder to if the JDK installer doesn't already do it for you. To have Eclipse load the correct .jar files automatically simply select the following file path and name it whatever you want. For instance I recently downloaded the latest JDK, installed it on my machine, and copied the entire folder to /System/Library/Java/JavaVirtualMachines, the location of installed JRE/JDK's. 

So the following path should be selected and named from within Eclipse Installed JRE's>Add

/System/Library/Java/JavaVirtualMachines/1.8.0_102.jdk/Contents/Home/jre

or if it's a JRE it will simply be the /Home folder of the same file path.

Now the .jar files will be loaded automatically. Do not change the build configuration but make sure all of the .jars linked in the library are replaced with the newest download release, which is explained below.

The .dmg format is a JDK installer for your OS, but you can still copy the .jdk file in /Library/Java/JavaVirtualMachines to the location above. The automatic Java update installer in Mac OS X System Preferences>Java will also update/install to this location, I believe, but it may be installed elsewhere as I removed the files and Java still said it had the latest update. I've included a screen shot to show you what JOGL/Jogamp/Java3D files to copy into the aforementioned directory, and another one to show you what should be imported into your project libraries. All other files can be removed beforehand as the new jnilib and dylib files are in the jogamp release under /lib/Your OS. The rest of the .jar are in /jar and /jar/atomic.

The following link is the current installation I'm using without doing any native linking. If you already have you can go into Build Configurations and select each class on the left, and remove each native link path. Restore default will help if you've changed the configuration.

https://jogamp.org/wiki/index.php/Java3D_FAQ

Once you're done installing, you can delete the old errors from the problems tab to remove all the warnings.

You can traverse the file system by opening your command shell and typing "cd /", followed by "cd System," etc. The command "ls" will list the contents of the folder. You can go backwards by typing "cd ../". Type "open JavaVirtualMachines" to open the folder in Finder once you have gotten to "cd Java" where the file is located and copy the new JRE/JDK into it, so that you can use the JVM under System/Library to store your JRE's and switch between different versions. Once you open a file from the shell, you can use the drop down list to navigate back to /Mac OS X and navigate with the mouse.

I am using Mac OS X Lion version 10.7.5 with 4 GB's of RAM and stock VRAM(Update MacOS High Sierra 10.13.2 upgradeable to 16 GB, but 8 officially). Don't forget you can take your Mac to the Apple store and they will upgrade it to the newest possible OS for free. It takes a few minutes to load a million hairs in Blender, which I use to edit my object models. I would recommend Blender or AutoDesk Maya. You can download .obj files online or there are many other formats. The material .mtl file holds the texture data and has to be accessed some other way. 

I first used Eclipse Luna IDE which I would highly recommend on Leopard. Now I'm running Eclipse Oxygen 4.7.1a on High Sierra. From your project build settings(right click on project, click Build Path/Configure Build Path/Library pane/Add Library/User Library, name it, and then Add External jars to that) and for this project, create an Images folder. The background of the login window streams a live website url. You can change it but it currently is limited as to what pages it can render fully. I have not encoded it for CSS etc.    

I use Amazon Web Services RDS MySQL Database and an EC2 instance for Security Groups. Just allow incoming and outgoing TCP connections to "My IP Address"(which can change periodically) through port 3306. Uncheck the Multi-AZ deployment to stay on the free tier. My costs are about 50 cents a month, but afterwards go up to around 15-20 dollars a month for my usage.  

This project is an open source game template for developers who want to build a fully functional OpenGL and Java based application that's easily portable to other systems. This project mostly uses Swing for it's windowing toolkit. The OpenGL functions can be converted directly to C# or C++ syntax within seconds by using a simple replace all text function within Eclipse, changing "GL2.GL_METHOD_EXAMPLE to the original GL_METHOD_EXAMPLE." OpenGL is widely used in the console industry and easily translates to DirectX and graphics standards allow for easy cross-project development on any gaming console whether DirectX or OpenGL, the two leading graphics libraries. In the future I plan to migrate the code to the Hololens when it's software development kit becomes available, as it's currently in early development phases as well as the ALICE Bot. 

  -Removed Maven from project currently. If you haven't installed or used Maven before ignore this. When updating the pom.xml file it corrupted the entire project. To remove it, right click on the project and then Maven-->Disable Maven nature, then you will need to edit in your Build Path, go to the sources tab and remove the two target output folders, renaming the output folder to Heavy Evil/bin and hit okay. Then you will be allowed to delete the target folder, which reduplicates itself after delete and cannot be deleted from within the system. An incorrect build will corrupt the entire project. XML does help but I will probably be waiting until later, and at first it helped but after some changes to the code it no longer seems to effect anything. 
  
  -Removed SwingWorker multithreading for the moment and put my sql connection in the main JDial.java class because I am still practicing multithreading.
  
  Note:To copy and paste my code you must click New>Class, name the file the same thing unless you want to change the classes inside it too, with no extra arguments because you would just delete them and copy my code. You must set the superclass for each of my classes which are JDialog for MainWindow.java, JFrame for GameIntro.java, and Frame for ObjectInteractive.java. Also don't forget to right click on your project main file and click Properties>Java Compiler and set compliance level to 1.8 or 9. It should also work on 1.6 but I haven't tried it. It now runs on Beta Java SE 9 as well. The image overlap on MainWindow is caused by an image with a white(clear) backdrop. Soon I will be working on importing a blender or maya animation by keystrokes. 
  
  My website heavyevil.gq is not yet connected to this project but was registered on dot.tk or freedomains.com and you simply take the NS Records from your DNS management options in dot.tk and put them into an AWS Hosted Zone on amazon.aws.com, allowing all incoming connections. MySQL only allows connections through port 3306 but you can use the same EC2 instance and Security group and add the rules. Your HTML, CSS etc. can be stored in S3 under the file name that you want your website to be called(www.website.com), and I will eventually be looking into OpsWorks for JSP, and Elastic Beanstalk to host an administration version of my application most likely for later use with the website. Spring Framework also may have their own cloud if you want to look into that route or many others such as Google Cloud, Heliohost etc. I use Firefox add-ons FireBug, FireDiff and Fireformat to edit the website live. They allow you to export the finished page which you then use to replace the older version on S3.

