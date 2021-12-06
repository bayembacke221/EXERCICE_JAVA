#include <iostream>
#include <math.h>
using namespace std;

class EquationSecondDegre{
    private:
    double r1, r2;
    double delta;
    double a, b, c;
    public:
    EquationSecondDegre(double, double, double);
    void AffichageDiscriminant();
    bool resoudre();
    void AffichageSolution();
};
EquationSecondDegre::EquationSecondDegre(double x0, double x1, double x2){
    a=x0;
    b=x1;
    c=x2;
    delta=b*b -(4*a*c);
}
void EquationSecondDegre::AffichageDiscriminant(){
    cout<<"Le discriminant est:"<<delta<<endl;
}
bool EquationSecondDegre::resoudre(){
    if (delta<0)
    {
        cout<<"Pas de solution dans R"<<endl;
        return false;
    }
    else if (delta>0)
    {
        r1=(-b -sqrt(delta))/(2.0*a);
        r2=(-b +sqrt(delta))/(2.0*a);
    }
    else
    {
        r1=-b/(2.0*a);
    }
    return true;
}
void EquationSecondDegre::AffichageSolution(){
    if (delta>0)
    {
        cout<<"La premiere solution est:"<<r1<<endl;
        cout<<"La deuxieme solution est:"<<r2<<endl;
    }
    else if (delta==0)
    {
        cout<<"La solution double est:"<<r1<<endl;
    }
    else
    {
        cout<<"Pas de solution dans R!!"<<endl;
    }
    
    
}
int main(int argc, const char** argv) {
    EquationSecondDegre Equation(-2.0,1.0,3.0);
    Equation.AffichageDiscriminant();
    Equation.resoudre();
    Equation.AffichageSolution();
    return 0;
}