#include <iostream>
#include <cstdlib>
using namespace std;
int func_mul(int x){
    return x*2;
}
void func_div(int x){
    cout<<x<<endl;
}
int main(int argc, const char** argv) {
    int a=2;
    cout<<func_mul(44)<<endl;
    cout<<func_mul(8)<<endl;
    func_div(a);
    cout<<rand();
    return 0;
}  
