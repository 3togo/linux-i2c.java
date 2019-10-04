//package io.dvlopt.linux.i2c ;
import io.dvlopt.linux.i2c.I2CBuffer;
class HelloWorld
{
    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(String args[])
    {
        I2CBuffer buffer = new I2CBuffer( 255 ) ;
        System.out.println("Hello, World");
    }
}
