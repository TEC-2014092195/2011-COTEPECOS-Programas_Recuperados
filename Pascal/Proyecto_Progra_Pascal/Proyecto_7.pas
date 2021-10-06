{Derechos Reservados Kevin Hernandez/10-5/COTEPECOS/2011}
program Proyecto_1_7;
uses crt,dos;
var
        salir:string;
        total,long,anch:real;
begin
        clrscr;
        textcolor(green);
        writeln('*****************************************************************************');
        writeln('Programa Nø: 7');
        writeln('Descripci¢n: Calcula la superficie de una habitacion');
        writeln('Elaborado por: Kevin Hernandez Rostran');
        writeln('Fecha: 28/6/2011');
        writeln('*****************************************************************************');
        writeln('');
        writeln('');
        textcolor(7);
        repeat
        begin
        write('Digite la Longitud (en mts) de la habitaci¢n: ');
        readln(long);
        writeln();
        write('Digite la Anchura (en mts) de la habitaci¢n: ');
        readln(anch);
        writeln();
        total:= long * anch;
        writeln('La superficie de la habitaci¢n es: ',total:0:4,' metros cuadrados');
        writeln();
        write('Digite "si" para salir: ');
        readln(salir);
        end;
        until salir = 'si';
end.



