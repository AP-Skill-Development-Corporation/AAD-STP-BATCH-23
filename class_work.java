Hello Good Evening to all
All of you open the android Studio 
Also Open the Yesterday's project
is it completed?

1.Hello Toast app Count display in the tosat message
2.Time Picker 
3.Check the UI Component Switch button is working or not 

----------Good Evening to All----------
All of you open the Android Studio

All o f you open the previoues day project

RecyclerView:
total 6 types of componests :
1.Data:contacts,gmails,Photos,audio/video files..etc
2.Recyclerview:Design the recyclerview class
3.Layout:each and every row have common layout 
4.LayoutManager:all layouts will be controled by LM
5.Adapter:provies the interface to recyclerview and ViewHolder
6.ViewHolder:It can be hold the View

Hello Good Evening to all
All of you open the android Studio

service-a serviceis a long running background task without user interation 
ex:notification,alarm,dowloading ,music..etc
notification:A notification is service .It isone reminder or alert
where we recive ?Notification Dwarwer:
Out side the app UI
For Notiication Design we need reqvired the 3 main componets :
	1.SmallIcon
	2.Title
	3.Text
For Notificsation Creation three classes:
below api level 26 ->two classes
1.NoticationManager 
2.NoticationCompact.Builder 
above api level 26 ->three classes
1.NoticationManager 
2.NoticationCompact.Builder
3.NotificationChannel  

Good Evening to All
please open the android studio


Database:
CURD Opartions
Create
Update
Read
Delete
In Android Default DB is SQLITE ->




A Very Good Morning to All
 Session will start with in 5m


Instuction for while attending online meeting
1.Mute your microphone and turn off webcamera
2.if you have any doubts please post in the chat box
---------
I'm muneiah tellakula

varaprasad 
Sai shankar 

What is a Android?
An Android is a platform which consits mobile oparating System based on the linux kernal

History of the Android :
key-developersof android 
1.Andy Rubin
2.Nic Sear
3.Crish White
4.Ric Minar
2003 Android Inc --think for for dev..digital camera s/w build ..
2y..
they went deep losses..
diverted theire idea to Mobile Android OS-->2005
same 2005-google was adapted android 
2007-google released first android OS Mobile 
HTC-Dream
Alapha
Beta
C-CupCake
D-Dount
E-Eclar
F-Froyo
G-Gingger Bread
H-honey Comb
I-Ice Cream Sandwich
J-Jelly Bean
K-Kit kat
L-Lapipop
M-marshMallo
N-Nougt
O-Oreo
P-Pie
Q-Android 10
Android 11
-----
Android Platform Architecture/Android Stack
5 layers:
1.System apps and User apps
	Systema apps:No Special status
	User App :User download the apps from anyware

2.API Framework:Java API Framework
	API:Application Program Interface 

3.Runtime,native Lib..
while app runtime it will be handle some services like:some runtime permissions 

4.HAL(HardWare Abstartion Layer):
ex:camera-hardware com..
	button-software com..

5.Linux Kernal :Will Responisble for sharing or allocating the  all resources 
Res:Link memory,power..etc..
64 ->80gb 
----Appication Basic building Blocks:
1.Resourses:
	images,strings,colors,styles,..etc
2.App Components:4 types
	1.Activity:
	An activity is single screen which contains some User Interation 
	UI-Components:Buttons,images,text..etc
	ex:app single Screen 
	two-files
		1.Xml,2.Java
	2.Service:
		A Service is long Running Background task without user interation 
		ex:Music,Notification,Alarm,downloading..etc
	3.BroadCast Recivers:
		System Announcements:
		ex:plug in the mobile charge-->top charging symbol will come 
	4.Content Provider:
	it will bridge between the two apps for providing the content 
	content:contacts,gallery,audio,video,doc files...etc..
x-app   y-app           z-app
sai-123  saifrind-123   saijanJigiri-123

memory is waste

3.Manifest:
Entire app information will proviede here ..
also it will handle the runtime permission
4.build Configuration:app build informaion have here,like,version,which type of SDK 
APK:Android application Package
-----Day-2----------
Today objective:
Android Studio Project structre
Create first android studio project 
how to run app in our mobile phone 


Open Apps.
Touch Settings > System.
Touch About phone.
Touch the Build number field 7 times. You will begin seeing a message as you approach the 7 touches.
Touch the back arrow once complete, and developer options will now appear under Settings > System > Advanced > Developer options.

-----Day-3----------

Good morninG to all
Today -objective
View and Viewgroups ,layouts
Create intractable app 
Hello Toast app


Today's Objective 
Scrollview And Textview:
	We will scroll the huge amount of data..
	It will suport only one chaild either its viewgroup or view

Intents in Android:
	An Intent is intenstion to movie one screen to another
	We will navigate the one activity to anothor activity through the INTENTS 
Advantages:
	Start the Activity 
	Start the service 
	Stop the service
	Send the Broadcast Signals
	
Types of the Intents 
	two types :	
		1.Explicit Intent
			Starts Specific acivity 
				we know the source and destination 
				it will be navigate within the app screen 
				ex:Flipcart-->List of items should open 
				choose the item->Smart Tv-->details activtity->add to cart -->payment 
				ex2:whtsup->4-chat->contact->chatting screen
			syntax:Intent intentObj=new Intent(this,destinationacivityname.class);
					startActivity(intentObj)
		2.Implicit Intent :
			Asks system to find an Activity that can handle this request
			ex1:whatsup->"Tommorow is holiday"->share->others screen activitys
			ex2:www.apssdc.in->chrom or firefox or vidmet or broswer or uc broswer or ..etc
			Syntax:	
				Uri uriOjt=Uri.parse("www.apssdc.in");
				Intent i=new Intent(Intent.action,uri);
				startAcivity(i);


http://meet.google.com/isr-ivmh-rcz
