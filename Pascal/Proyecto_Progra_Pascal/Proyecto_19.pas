{Derechos Reservados Kevin Hernandez/10-5/COTEPECOS/2011}
program Proyecto_1_19;
uses crt,dos;
var
        nombre:string;
begin
        clrscr;
        textcolor(green);
        writeln('*****************************************************************************');
        writeln('Programa Nø: 19');
        writeln('Descripci¢n: Utilizar gotoxy');
        writeln('Elaborado por: Kevin Hernandez Rostran');
        writeln('Fecha: 28/6/2011');
        writeln('*****************************************************************************');
        writeln('');
        writeln('');
        textcolor(10);
        write('Escribe tu nombre: ');
        readln(nombre);
        writeln('');
        textcolor(14);
        writeln(nombre,' con gotoxy se elige la posicion en que desees que escriba el programa');
        gotoxy(25,15);
        textcolor(11);
        writeln('por ejemplo hacia el centro');
        gotoxy(26,16);
	writeln('        . --- .');
        gotoxy(26,17);
        writeln('      /        \');
        gotoxy(26,18);
	writeln('     |  O  _  O |');
        gotoxy(26,19);
        writeln('     |  ./   \. |');
        gotoxy(26,20);
	writeln('     /  `-._.-''  \');
        gotoxy(26,21);
        writeln('   .'' /         \ `.');
        gotoxy(26,22);
	writeln('.-~.-~/           \~-.~-.');
        gotoxy(26,23);
        writeln('       HOLA ',nombre);
        readln;
        end.
