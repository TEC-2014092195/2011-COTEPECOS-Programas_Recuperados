{Derechos Reservados Kevin Hernandez/10-5/COTEPECOS/2011}
program Proyecto_1_6;
uses crt,dos;
var
        a,b:integer;
begin
        clrscr;
        textcolor(green);
        writeln('*****************************************************************************');
        writeln('Programa Nø: 6 ');
        writeln('Descripci¢n: Escribir sentencias que cambien el valor de dos variables');
        writeln('Elaborado por: Kevin Hernandez Rostran');
        writeln('Fecha: 28/6/2011');
        writeln('*****************************************************************************');
        writeln('');
        writeln('');
        textcolor(7);
        write('Digite su primera variable (entero): ');
        readln(a);
        write('Digite su segunda variable (entero): ');
        readln(b);
        textcolor(10);
        writeln;
        a:=b+a;
        writeln('El valor de su primer variable es: ',a);
        b:=a+b;
        writeln;
        writeln('El valor de su segunda variable es: ',b);
        readln;
end.

