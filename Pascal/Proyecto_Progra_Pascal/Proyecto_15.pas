{Derechos Reservados Kevin Hernandez/10-5/COTEPECOS/2011}
program Proyecto_1_15;
uses crt,dos;
var
        nombre:string;
begin
        clrscr;
        textcolor(green);
        writeln('*****************************************************************************');
        writeln('Programa Nø: 15 ');
        writeln('Descripci¢n: Te pregunta tu nombre y te saluda');
        writeln('Elaborado por: Kevin Hernandez Rostran');
        writeln('Fecha: 28/6/2011');
        writeln('*****************************************************************************');
        writeln('');
        writeln('');
        textcolor(7);
        writeln('¨Cu l es tu nombre?');
        readln(nombre);
        clrscr;
        textcolor(7);
        textbackground(5);
        writeln('_|                  _|',nombre:20,' !       ! ',nombre,' ­­­­­­­­­');
        writeln('_|_|_|      _|_|    _|    _|_|_|',nombre:10,' !!     !! ',nombre,' ­­­­ ­­­­');
        writeln('_|    _|  _|    _|  _|  _|    _|',nombre:10,' !!!   !!! ',nombre,' ­­­   ­­­');
        writeln('_|    _|  _|    _|  _|  _|    _|',nombre:10,' !!!! !!!! ',nombre,' ­­     ­­');
        writeln('_|    _|    _|_|    _|    _|_|_|',nombre:10,' !!!!!!!!! ',nombre,' ­       ­');
        readln;
end.

