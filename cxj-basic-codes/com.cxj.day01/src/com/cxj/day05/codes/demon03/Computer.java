package com.cxj.day05.codes.demon03;


public class Computer {
    public void powerOn(){
        System.out.println("电脑开机了！");
    }
    public void powerOff(){
        System.out.println("电脑关机了！");
    }

    public void useDevice(USB usb){
        usb.Open();
        //向下转型,调用键盘或者鼠标的专属动作
        if(usb instanceof Mouse){
            Mouse mouse =(Mouse) usb;
            mouse.Click();
        }
        if(usb instanceof Keyboard){
            Keyboard keyboard =(Keyboard) usb;
            keyboard.type();
        }
        usb.Close();
    }
}
