{Derechos Reservados Kevin Hernandez/10-5/COTEPECOS/2011}
program Proyecto_1_2;
uses crt,dos;
var
        ta,tb,tc,tf,tg,th:integer;
        te:real;
begin
        clrscr;
        textcolor(green);
        writeln('*****************************************************************************');
        writeln('Programa Nø: 2 ');
        writeln('Descripci¢n: muestra el total de diferentes expresiones');
        writeln('Elaborado por: Kevin Hernandez Rostran');
        writeln('Fecha: 28/6/2011');
        writeln('*****************************************************************************');
        writeln('');
        writeln('');
        textcolor(white);
        writeln('El valor de las expresiones es: ');
        writeln('');
        ta:= 15 * 14 - 3 * 7; tb:= -4 * 5 * 2; tc:= (24+2*6) div 4; te:= 3+4*(8*(4-(9+3)/6)); tf:= 4*3*5+8*4*2-5; tg:= 4-40 div 5; th:= (-5) mod (-2);
        writeln('a) 15*14-3*7=   ',ta);writeln(''); writeln('b) -4*5*2=   ',tb); writeln(''); writeln('c) (24+2*6)div4=   ',tc); writeln(''); writeln('d) a div a div a * b=   1 div entre resultado de a * b');
        writeln; writeln('e) 3+4*(8*(4-(9+3)/6))=   ',te:0:2); writeln(''); writeln('f) 4*3*5+8*4*2-5=   ',tf); writeln; writeln('g) 4-40 div 5=   ',tg); writeln(''); writeln('h) (-5) mod (-2)=   ',th);
        readln;
end.
