Flow control statements
=======================
It decides the order in which the control will be trasfered.

flow control
============
a. selective statement
      1. if
      2. if else
      3. switch
b. iterative statement
      1. while
      2. do while
      3. for
      4. foreach
c. transfer staements
      a. break
      b. continue
      c. return
      d. System.exit(0)

if block
========
  To select some statements for execution based on condition,we use if block

syntax::
   if(boolean){
	  //statement-1
   }
      statement-2

workflow
=======
  boolean condition true means statement-1 will be executed otherwise statement-2 will be 
  executed.

eg#1.
   int x=0;
   if(x){
	System.out.println(x);
   }
   output:Compile time error

eg#2
   int x=0;
   if(x==0){
	System.out.println(x);
   }
   output:: 0

eg#3
   boolean res=false;
   if(res){
	System.out.println(res);
   }
   output:: nothing will be printed

eg#4
   boolean res=false;
   if(res=true){
	System.out.println(res);
   }
   output:: true

dowhileloop
===========
 if we want to execute the body of the loop atleast once then we prefer using do while loop.

do{

}while(boolean);

curly braces are optional,we can take only one statement between do and while.
one statement should not be declarative statement

eg::
do{
	System.out.println("hello");
}while(true);

output:: hello infinite times

eg::
do;while(true);
output:: compiles succesfull

eg::
do
  int x=10;
while(true);
output:: compile time error

eg::
do{
  int x=10;
}while(true);
output:: compilation succesfull

eg::
dowhile(true)
System.out.println("sachin");
while(true);
sachin infinite times

eg::
dowhile(true);
output:: compilation error.

eg::
do{
	System.out.println("sachin");
}while(true);
System.out.println("dhoni");
output:: unreachable code

eg::
do{
	System.out.println("sachin");
}while(false);
System.out.println("dhoni");
Ouput:: sachin dhoni

eg::
int a=10,b=20;
do{
	System.out.println("sachin");
}while(a<b);
System.out.println("dhoni");
output::sachin infinite times

eg::
int a=10,b=20;
do{
	System.out.println("sachin");
}while(a>b);
System.out.println("dhoni");

output:: sachin dhoni


eg::
final int a=10,b=20;
do{
	System.out.println("sachin");
}while(a<b);
System.out.println("dhoni");

output::CE

eg::
final int a=10,b=20;
do{
	System.out.println("sachin");
}while(a>b);
System.out.println("dhoni");

Output:: sachin dhoni


eg::
final int a=10,b=20;
do{
	System.out.println("sachin");
}while(a<b);
System.out.println("dhoni");

Output:: CE

eg::
final int a=10;
do{
	System.out.println("sachin");
}while(a>20);
System.out.println("dhoni");

Output:: sachin dhoni

forloop
======
 It is one of the most commonly used loop and best suitable if we know the no of iterations in 
 advanced.

Syntax::
  for(initialisation;condition;incr/dec)
  {
	//body of loop
  }

Note: curly braces are optional, we can take only one statement and that statement should not be
      declarative.


eg:: 
int i=0;
for(System.out.println("hello");i<3;System.out.println("hi")){
  i++;
}
Output:: hello hi hi hi

eg::
for(;;){
	System.out.println("hello");
}
Output:: hello

eg::
for(;;)
  int x=10;
output:: Compile time error


eg::
for(;;){
	int x=10;
}
output::Compiles succesfully

eg::
for(int i=0;i<true;i++){
  System.out.println("sachin"); 
}
System.out.println("dhoni");

output::CE

eg:: 
for(int i=0;i<false;i++){
  System.out.println("sachin"); 
}
System.out.println("dhoni");
output:: CE

eg::
for(int i=0;;i++){
  System.out.println("sachin"); 
}
System.out.println("dhoni");

Output::CE

eg::
int a=10,b=20;
for(int i=0;a<b;i++){
  System.out.println("sachin"); 
}
System.out.println("dhoni");
output:: sachin ....

eg::
final int a=10,b=20;
for(int i=0;a<b;i++){
  System.out.println("sachin"); 
}
System.out.println("dhoni");
output:: CE

forloop on arrays
=================
eg#1.

int[] arr={10,20,30};
for(int i=0;i<=2;i++){
   System.out.println(arr[i]);
}

for(int i=0;i<=arr.length;i++){
   System.out.println(arr[i])
}

for(int i=0;i<=arr.length;i++)
   System.out.println(arr[i])


eg#2
int[] arr = {{10,20,30},{40,50,60},{70,80,90}};

for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
	System.out.print(arr[i][j]+"\t");
    }
   System.out.println();
}

for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
	System.out.print(arr[i][j]+"\t");
    }
   System.out.println();
}

for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++)
	System.out.print(arr[i][j]+"\t");
    System.out.println();
}





Transfer statement
=================
1. break
2. continue
3. return

break
  It is used to break out of the loop.
  It is used in switch to stop fall through
  It is used inside labeled block to break block execution based on some condition.

switch
=====
  int x=0;
  switch(x){
	case 0: System.out.println("hello");
		break;
	case 1: System.out.println("hiee");
  }
Output:hello

forloop
=======
  for(int i=0;i<5;i++){
	if(i==3)
	   break;
	System.out.println(i);
  }
Output::
1
2
3

Inside labeled block
====================
int x=10;
l1:{
	System.out.println("begin");
	if(x==10)
	   break l1;
	System.out.println("end");
}
    System.out.println("hello");

Output:: begin
         hello

These are the only places where we can use break othe places if we use compiler will throw an error as break outside swith or loop.

eg::
int x=10;
if(x==10)
  break;
System.out.println("hello");

output:: ce:: break outside switch or loop

continue
=======
 To skip current iteration and continue for next iteration we use continue.

eg#1.
for(int i=0;i<=5;i++){
	if(i==3)
	   continue
    System.out.println(i);
}
output::
0
1
2
4
5

eg#2.
int x=2;
for(int i=0;i<10;i++)
{
	if(i%x==0)
	   continue;
	System.out.println(i);
}
output
1
3
5
7
9

eg#3.
int x=10;
if(x==10)
  continue
System.out.println(x);
we can use continue only inside loop,if we use it any where else it would result in compile time
error saying :continue outside the loop.

labelled break and continue
===========================
l1:for(;;){
   .....
   .....
   l2:for(;;){
	.....
	.....
	.....
	l3:for(;;){
		.....
		.....
		.....
		break l1;
		break l2;
		break l3;
		.....
		.....
		.....
	}
	......
	......

   }
   ....
   ....
   ....
}

eg#1.
l1:for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		if(i==j)
			stmt-1;
		System.out.println(i+"...."+j);
	}
   }
what is the output if the stmt-1 is replaced as shown below?
stmt-1 : break; 
stmt-1 : break l1;
stmt-1 : continue;
stmt-1 : continue l1;

dowhile with continue
=====================
  int x=0;
  do{
	++x;
	System.out.println(x);
	if(++x<5)
	  continue;
        ++x;
	System.out.println(x);
   }while(++x<10);

Note:: Compiler will never check unreachability in case of if else where as unreachable code is 
       applicable only for loops.




























