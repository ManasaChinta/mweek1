/**
*Java program to count valid numbers
*num=5643=>count=4
*/
class count
{
public static void main(String a[])
{
try{
int count=0,num=5643;
while(num!=0){
//num=num/10
num/=10;
++count;
}
}
System.out.println("number of digits:"+count);
}
}