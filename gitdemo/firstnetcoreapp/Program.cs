
using System;

namespace FirstNetCoreApp
{
    public delegate int MathOpDelegate(int M,int N);
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            Console.WriteLine(DateTime.Now.ToString());
            Console.WriteLine("Result of Add:\t");
        }
    }
}