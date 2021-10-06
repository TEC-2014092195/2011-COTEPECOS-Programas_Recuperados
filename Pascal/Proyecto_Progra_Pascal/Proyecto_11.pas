{Derechos Reservados Kevin Hernandez/10-5/COTEPECOS/2011}
program Proyecto_1_11;
uses crt,dos;
var
        num1,num2,num3,a,b,c:integer;
begin
        clrscr;
        textcolor(green);
        writeln('*****************************************************************************');
        writeln('Programa Nø: 11 ');
        writeln('Descripci¢n: Que el usuario digite tres numeros y los almacene en 3 variables');
        writeln('Elaborado por: Kevin Hernandez Rostran');
        writeln('Fecha: 28/6/2011');
        writeln('*****************************************************************************');
        writeln('');
        writeln('');
        textcolor(11);
        writeln('Digite el primer numero entero: ');
        readln(num1);
        writeln('Digite el segundo numero entero: ');
        readln(num2);
        writeln('Digite el tercer numero entero: ');
        readln(num3);
        a:=num1;
        b:=num2;
        c:=num3;
        textcolor(7);
        writeln('Sus numeros son: Primero)  ',a,'  Segundo)  ',b,'  Tercero)  ',c);
        readln;
end.
