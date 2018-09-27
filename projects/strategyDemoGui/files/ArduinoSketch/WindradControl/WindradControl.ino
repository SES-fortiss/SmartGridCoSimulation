//  Steuerung des Windrads über den Raspberry!
//  Author:Markus Schmidt
//  Date:28.10.2014
//  Version: 1.0

#include "MotorDriver.h"

int zahl1 = 0, zahl10 = 0, zahl100 = 0;
byte z1= 48, z10 = 48, z100 = 48;
int pointer = 0;
int istSpeed = 0;

void setup()
{
    motordriver.init();
    Serial.begin(9600);
}
 
void loop()
{
  if(istSpeed==0)
  { 
    motordriver.stop(); 
  }else{
    if(istSpeed>=60){
      motordriver.setSpeed(istSpeed,MOTORA);
      motordriver.goForward();
    }else{
      motordriver.setSpeed(60,MOTORA);
      motordriver.goForward();
      delay(istSpeed);
      if(istSpeed<30){
        delay(30-istSpeed);
      }
      
      motordriver.stop();
      delay(60-istSpeed);
    }
  }
}


void serialEvent(){
  Serial.write("serialEvent(){}\n");
  byte in = Serial.read();
  if(istAbschluss(in)){
    if(pointer>0){
      istSpeed = parsePower();
      Serial.write("Motorgeschwindigkeit angepasst: ");  
      Serial.write(z100);
      Serial.write(z10);
      Serial.write(z1);
      Serial.write("\n");
      zahl1 = 0;
      zahl10 = 0;
      zahl100 = 0;
      z1 = 48;
      z10 = 48;
      z100 = 48;
      pointer = 0; 
    }
  }else{
    if(istZahl(in)){
      Serial.write("Zahl erkannt!");
      zahl100 = zahl10;
      zahl10 = zahl1;
      z100 = z10;
      z10 = z1;
      pointer++;
      if(pointer>3){ Serial.write("Fehler: zu viele Zahlen!");}
      z1 = in;
      Serial.write(z1);
      switch(in){
        case '0': zahl1 = 0; break;
        case 49: zahl1 = 1; break;
        case 50: zahl1 = 2; break;
        case 51: zahl1 = 3; break;
        case 52: zahl1 = 4; break;
        case 53: zahl1 = 5; break;
        case 54: zahl1 = 6; break;
        case 55: zahl1 = 7; break;
        case 56: zahl1 = 8; break;
        case 57: zahl1 = 9; break;
        default: break;
      }
    }
  }
}
  
int parsePower(){
  int z = zahl1 + zahl10*10 + zahl100*100;
  return z;
}

boolean istAbschluss(byte in){
  if(in==65){
    Serial.write("Abschluss erkannt!");
    return true;
  }
  return false;
}  
  
boolean istZahl(byte in){
  if(in>=48&&in<=57){
    return true;
  }
  return false;
}
