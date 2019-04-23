# include <iostream>

using namespace std;

int main(){	
		
	int tiempo =0;
	float precio;
	string dia;
	string turno;
	
	cout<<"Ingrese el dia de la llamada (lunes,martes,miercoles,jueves,viernes,sabado,domingo)"<<endl<<endl;
	cin>>dia;
	cout<<"Ingrese el turno correspondiente (m)(v): "<<endl<<endl;
	cin>>turno;
	cout<<"Ingrese los minutos de llamada por telefono: "<<endl<<endl;
	cin>>tiempo;


	
	if(tiempo<=5){        
        precio=5;
    }else if(tiempo<8){
        precio=(tiempo-5)*0.8+5.75;
    }else if(tiempo<10){
        precio=(tiempo-8)*0.7 + 7.4;
    }else{
        precio=(tiempo-10)*0.5;
    }

    if(dia=="domingo"){
        precio=precio+precio*0.03;
    }else if(turno=="M" || turno=="m"){
        precio=precio+precio*0.15;
    }else{
        precio=precio+precio*0.10;
    }
    
    cout<<"El total de la llamada en dolares es: "<<precio<<endl;
    
	return 0;
}
