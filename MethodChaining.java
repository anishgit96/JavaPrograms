public class MethodChaining {

    public void facto(C c)
    {
        c.out().show().disp();
    }

}

interface A<I>
{
   A disp();
   A disp2();
   A disp3();
}

interface B extends A<C>
{
    B show();
}

interface C extends B
{
   B out();
}
