# Heavy-Evil
Application/Web Forum/Game Framework Template


SDK's and Services currently used in project development.

JOGL 2.3+(Includes all current OpenGL bindings),
MySQL Connector/J 5.1+,
Spring 4.4+(for later stages, meant to be used when hosting your own servers),
JRE and JDK 1.8+ System Library(Java SE 8) but was originally built on JDK and RE 1.6,
JSoup 1.8.3(currently unused), and Java3D(unused at this point, but included in the Java standard library)for a higher level graphics library that is meant to scale multiplayer online games quickly, to be used on top of JOGL for more simplicity.  

 Install the JDK's and JRE's in your project environment or IDE. I currently use Eclipse Luna IDE which I would recommend. You only need to add the external jar files from your project build settings and create an Images folder within the project for your image sources. The background of the login window streams a live website url. You can change it in the code, but it currently is limited as to what pages it can render.   

I use Amazon Web Services RDS MySQL Database and an EC2 instance for Security Groups. Just allow incoming and outgoing TCP connections to "My IP Address"(which can change periodically) through port 3306.

This project is an open source game template for developers who want to build a fully functional OpenGL based application that's easily portable to other systems. Everything has it's own windowing toolkit. This project uses Swing and AWT. There is also JavaFX. The graphics can be saved and converted in many different file formats. Models can be easily created with 3rd party software like AutoDesk Maya or Blender. The OpenGL functions can be converted directly to C# or C++ syntax within seconds by using a simple replace all text function within Eclipse, changing "GL2.GL_METHOD_EXAMPLE to the original GL_METHOD_EXAMPLE." OpenGL is widely used in the console industry and easily translates to DirectX and graphics standards allow for easy cross-project development on any gaming console. In the future I plan to migrate the code to the Hololens when it's software development kit becomes available, as it's currently in early development phases as well as the ALICE Bot most likely using node.js api or there may be a JDK. 

  -Removed Maven from project. If you haven't installed or used Maven before ignore this. It showed instability when updating the pom.xml file and corrupted the entire project. To remove it, right click on the project and then Maven-->Disable Maven nature, then you will need to edit in your Build Path, go to the sources tab and remove the two target output folders, renaming the output folder to Heavy Evil/bin and hit okay. Then you will be allowed to delete the target folder, which reduplicates itself after delete and cannot be deleted from within the system. An incorrect build will corrupt the entire project. XML does help but I will probably be waiting until later, and at first it helped but after some changes to the code it no longer seems to effect anything. 
  
  -Removed SwingWorker for the moment and put my connection class in the main file because I am still practicing multithreading and found it is an AWS issue where "USE database" only works on certain regions. I also finished configuring the connection to accept user input. 
  
  My website heavyevil.gq is not yet connected to this project but was registered on dot.tk or freedomains.com and you simply take the NS Records from your DNS management options in dot.tk and put them into an AWS Hosted Zone, allowing all connections. MySQL only allows connections through port 3306 so you can use the same EC2 instance and Security group. Your HTML, CSS etc. can be stored in S3 under the file name that you want your website to be called, and I will eventually be looking into OpsWorks for JSP, and Elastic Beanstalk to host an administration version of my application most likely for later use with the website. Spring Framework also may have their own cloud if you want to look into that route or many others such as Google Cloud, Heliohost etc. I use Firefox add-ons FireBug, FireDiff and Fireformat to edit the website live. 

