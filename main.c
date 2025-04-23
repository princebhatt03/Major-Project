#define BLYNK_TEMPLATE_ID "TMPL3e96tpKYJ"
#define BLYNK_TEMPLATE_NAME "Tesla car"
#define BLYNK_AUTH_TOKEN "bD7V1oSIAcMK5S1K0qgpfEQnuURPkiLH"

#define BLYNK_PRINT Serial
#include <ESP8266WiFi.h>
#include <BlynkSimpleEsp8266.h>


# define trigPin D5
# define echoPin D6
# define MODE D4
# define LS D7
# define RS D8

#define  m11  D1
#define  m12  D0
#define  m21  D2
#define  m22  D3

char auth[] = BLYNK_AUTH_TOKEN;
char ssid[] = "data";
char pass[] = "data1234";


int temp1=0;
int temp2=0;
int duration, distance;




void fwd()
  {

digitalWrite(m11,1);
digitalWrite(m12,0);
digitalWrite(m21,1);
digitalWrite(m22,0);
  }

void rev()
  {

digitalWrite(m11,0);
digitalWrite(m12,1);
digitalWrite(m21,0);
digitalWrite(m22,1);
  }

void right()
  {

digitalWrite(m11,0);
digitalWrite(m12,1);
digitalWrite(m21,1);
digitalWrite(m22,0);
  }

void left()
  {

digitalWrite(m11,1);
digitalWrite(m12,0);
digitalWrite(m21,0);
digitalWrite(m22,1);
  }

void stp()
  {

digitalWrite(m11,0);
digitalWrite(m12,0);
digitalWrite(m21,0);
digitalWrite(m22,0);
  }








void dist()

{
digitalWrite(trigPin, HIGH);
delay(1);
digitalWrite(trigPin, LOW);
duration = pulseIn(echoPin, HIGH);
distance = (duration / 2) / 29.1;
}



BLYNK_WRITE(V0) 

{
  bool value1 = param.asInt();
  if ((value1 == 1) && (temp1==0))


  {
    fwd();
    delay(100);
  } 
  else 
  {
    stp();
 
  }
}

//Get the button values
BLYNK_WRITE(V1) {
  bool value2 = param.asInt();

  if ((value2 == 1) && (temp1==0))
  {
    rev();
    delay(100);
  } 
  else 
  {
   
   stp();
 
  }
}


BLYNK_WRITE(V2) {
  bool value3 = param.asInt();
  
  if ((value3 == 1)&& (temp1==0))
  {
    left();
    
    delay(100);
  } 
  else 
  {
   stp();
   
  }
}



BLYNK_WRITE(V3) {
  bool value4 = param.asInt();
  
  if ((value4 == 1)&& (temp1==0)) 
  
  
  {
    right();
   
    delay(100);
  } 
  else 
  {
    stp();
  }
}

void setup() 

{
 
  pinMode(m11,OUTPUT);
  pinMode(m12,OUTPUT);
  pinMode(m21,OUTPUT);
  pinMode(m22,OUTPUT);

pinMode(trigPin, OUTPUT);
pinMode(echoPin, INPUT);
pinMode(LS, INPUT);
pinMode(RS, INPUT);
pinMode(MODE,INPUT);
Serial.begin(9600);
Blynk.begin(auth, ssid, pass);
digitalWrite(m11,0);
digitalWrite(m12,0);
digitalWrite(m21,0);
digitalWrite(m22,0);
delay(1000);
}







void loop() 


{ 


if (digitalRead(MODE)==0)

{

temp1=1;
  
dist();
if ( distance>=20 && (digitalRead(RS)==1) && (digitalRead(LS)==1) )
{ 
fwd();
delay(50);
}

else if ( distance>=20 && (digitalRead(RS)==1) && (digitalRead(LS)==0) )

{ 
right();
delay(50);
}


else if ( distance>=20 && (digitalRead(RS)==0) && (digitalRead(LS)==1) )

{ 
left();
delay(50);
}



else if ( distance>=20 && (digitalRead(RS)==0) && (digitalRead(LS)==0) )

{ 
rev();
delay(50);
}


else if ( distance<=30 )

{ 
stp();
delay(1000);
right();
delay(1000);
fwd();
delay(1000);
left();
delay(1000);
fwd();
delay(1200); 
left();
delay(1200);
fwd();
delay(1500);
}
else 
{ 
stp();
}
}

else if(digitalRead(MODE)==1)
{
temp1=0;}


Blynk.run();


}
