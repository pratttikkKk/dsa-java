 class Staticdemo{

static int count;

static
{
count = 10;
System.out.println("static block:"+count);
}

static void increatment(){
count++;
System.out.println("count after increatment:"+count);

}

public static void main(String args[]){
System.out.println("Main block:");
increatment();
System.out.println("final count:"+count);

}
}

