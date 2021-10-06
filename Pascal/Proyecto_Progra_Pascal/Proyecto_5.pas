{Derechos Reservados Kevin Hernandez/10-5/COTEPECOS/2011}
program Proyecto_1_5;
uses crt,dos;
var
        salir:string;
        total,a:integer;
begin
        clrscr;
        textcolor(green);
        writeln('*****************************************************************************');
        writeln('Programa Nø: 5 ');
        writeln('Descripci¢n: Lee un entero y lo multiplica por 2 y muestra el resultado');
        writeln('Elaborado por: Kevin Hernandez Rostran');
        writeln('Fecha: 28/6/2011');
        writeln('*****************************************************************************');
        writeln;
        writeln;
        textcolor(10);
        repeat
        begin
        writeln;
        write('Digite un numero entero: ');
        readln(a);
        total:=a*2;
        begin textcolor(11); writeln; writeln('El resultado es: ',total); end;
        end;
        writeln;
        write('Digite "si" para salir: ');
        readln(salir);
        until salir='si';
end.


