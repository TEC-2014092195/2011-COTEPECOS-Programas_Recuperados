{Derechos Reservados Kevin Hernandez/10-5/COTEPECOS/2011}
program Proyecto_1_14;
uses crt,dos;
var
        nombre:string;
begin
        clrscr;
        textcolor(green);
        writeln('*****************************************************************************');
        writeln('Programa Nø: 14 ');
        writeln('Descripci¢n: Dibuja un rectangulo y en el centro se muestra tu nombre');
        writeln('Elaborado por: Kevin Hernandez Rostran');
        writeln('Fecha: 28/6/2011');
        writeln('*****************************************************************************');
        writeln('');
        writeln('');
        textcolor(7);
        write('Digite su nombre: ');
        readln(nombre);
        textcolor(10);
        gotoxy(18,13);
        writeln('*************************************************');
        gotoxy(18,14);
        writeln('*                                               *');
        gotoxy(18,15);
        writeln('*                                               *');
        gotoxy(18,16);
        writeln('*                                               *');
        gotoxy(18,17);
        writeln('*                                               *');
        gotoxy(18,18);
        writeln('*                                               *');
        gotoxy(18,19);
        begin writeln('*'); gotoxy(39,19); writeln(nombre); gotoxy(66,19); writeln('*');  end;
        gotoxy(18,20);
        writeln('*                                               *');
        gotoxy(18,21);
        writeln('*                                               *');
        gotoxy(18,22);
        writeln('*                                               *');
        gotoxy(18,23);
        writeln('*                                               *');
        gotoxy(18,24);
        writeln('*************************************************');
        readln;
end.
