#include <iostream>
using namespace std;
int x=4;
int h(int &x)
{
    x=2*x;
    return x;
}
int g(int f)
{
    return x;
}
int &f(int &x)
{
    x+=::x;
    return x;
}
int main(int argc, const char** argv) {
    int x=3;
    f(::x)=h(x);
    cout<<f(x)<<endl;
    cout<<g(x)<<endl;
    cout<<h(x)<<endl;
    return 0;
}