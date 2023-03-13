public class Q_two {
    public static void main(String[] args)
    {
        ex ex1 = new ex("a",1);
        ex ex2 = new ex("b",2);
        ex ex3 = new ex("c",3);
        ex[] objArr = {ex1,ex2,ex3};
        ex[] objArrClone = {null,null,null};
        System.out.println("Obj Array comp:");
        for (int i = 0; i < objArr.length; i++)
        {
            System.out.println("Name: "+objArr[i].getName()+"          ID: "+objArr[i].getID());
        }
        for (int i = 0; i < objArr.length; i++)
        {
            objArrClone[i]=objArr[i];
        }
        System.out.println("Cloned object array components:");
        for (int i = 0; i < objArr.length; i++)
        {
            System.out.println("Name: "+objArrClone[i].getName()+"          ID: "+objArr[i].getID());
        }
    }
}
//for Qtwo