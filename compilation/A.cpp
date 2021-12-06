#include <iostream>
using namespace std;
 class A
 {
 protected:
     int x;
 public:
     A(){x=0; cout<<"1";}
     A(int){x=1; cout<<"2";}
     A(const A& a){
         x=a.x; cout<<"3";
     }
     A& operator=(const A& a){x=a.x; cout<<"4";
     return *this;}
     
 };
 class B{
     public:
    B(const A& a=A()):y(a){cout<<"5";}
    B(const A& b, int u){y=b; k=u; cout<<"6";}
    protected:
    A y;
    int k;
 };
 class C: public B{
     public:
     C(int t=1){z=t; cout<<"7";}
     C(A x):B(x){z=0; cout<<"8";}
     C(const B& x): B(x), a(1){z=0; cout<<"9";}
     protected:
     A a;
     int z;
 };
 int main(int argc, char const *argv[])
 {
     cout<<"\n-------------------A\n";
     A a0; cout<<"\n";
     A a1=a0; cout<<"\n";
     A a2=3; cout<<"\n";
     a0=a2; cout<<"\n";
     cout<<"\n---------------------B\n";
     B b0=a0; cout<<"\n";
     B b1(a0, 3); cout<<"\n";
     B b2; cout<<"\n";
     b2=b1; cout<<"\n";
     cout<<"\n----------------------C\n";
     C c0; cout<<"\n";
     C c1=a1; cout<<"\n";
     c0=b2; cout<<"\n";
     return 0;
 }
 