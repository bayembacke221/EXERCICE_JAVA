#include <iostream>
using namespace std;
class K
{
private:
    int v;
    static int id;
public:
    K()
    { 
        id++; v=id; cout<<"K() v="<<v<<endl;
    }
    K(const K & k)
    {
        id++; v=10+k.id; cout<<"K(K&) v="<<v<<endl;
    }
    int getv()
        {
         return v;
         }
    ~K(){cout<<"~K() v="<<v<<endl;}
};
int K::id=2;
K m(K k)
{
    if (k.getv()%2==0)
    {
        return k;
    }
    else
    {
        K *k1= new K();
        return *k1;
    }
    
    
}
int main(int argc, char const *argv[])
{
    K k;
    k=m(k);
    cout<<"\n";
    return 0;
}


