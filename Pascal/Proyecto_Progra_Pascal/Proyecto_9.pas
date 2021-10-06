{Derechos Reservados Kevin Hernandez/10-5/COTEPECOS/2011}
program Proyecto_1_9;
uses crt,dos;
var
        nombre:string;
        edad:integer;
begin
        clrscr;
        textcolor(green);
        writeln('*****************************************************************************');
        writeln('Programa Nø: 9 ');
        writeln('Descripci¢n: muestra la diferencia entre "write" y "writeln"');
        writeln('Elaborado por: Kevin Hernandez Rostran');
        writeln('Fecha: 28/6/2011');
        writeln('*****************************************************************************');
        writeln('');
        writeln('');
        textcolor(7);
        write('Escribe tu nombre: ');
        readln(nombre);
        write('                   ^^^^');
        writeln('');
        writeln('Viste ',nombre,' donde lo escribiste, sobre la linea eso es "write"');
        writeln('');
        textcolor(14);
        writeln('Ahora para "writeln" digita tu edad:');
        write('-->> ');
        readln(edad);
        writeln('Viste la digitaste en la siguiente linea para eso es "writeln"');
        textcolor(10);
        writeln('');
        writeln('Esa es la diferencia que el programa "sobre" o en la siguiente linea');
        readln;
end.
