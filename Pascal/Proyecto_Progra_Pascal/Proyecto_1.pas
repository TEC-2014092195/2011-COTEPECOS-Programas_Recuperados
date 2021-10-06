{Derechos Reservados Kevin Hernandez/10-5/COTEPECOS/2011}
program Proyecto_1_1;
uses crt,dos;
var
        salir:string;
        letra:char;
        ta,tb,tc,td,te,tf,tg,th:integer;
begin
        clrscr;
        textcolor(green);
        writeln('*****************************************************************************');
        writeln('Programa Nø: 1');
        writeln('Descripci¢n: Valores "div" "mod" ');
        writeln('Elaborado por: Kevin Hernandez Rostran');
        writeln('Fecha: 28/6/2011');
        writeln('*****************************************************************************');
        writeln('');
        writeln('');
        textcolor(white);
        repeat
        begin
        writeln;
        writeln('Para los casos de "div" digite la letra "d"');
        writeln('Para los casos de "mod" digite la letra "m"');
        writeln('');
        writeln('');
        textcolor(11);
        write('Cual caso desea: ');
        readln(letra);
        writeln;
        case letra of
        'd','D': begin ta:= 15 div 12; tb:= 24 div 12; tc:= 123 div 100; td:= 200 div 100; writeln('15 div 12 = ',ta); writeln('24 div 12 = ',tb); writeln('123 div 100 = ',tc); writeln('200 div 100 = ',td); end;
        'm','M': begin te:= 15 mod 12; tf:= 24 mod 12; tg:= 123 mod 100; th:= 200 mod 100; writeln('15 mod 12 = ',te); writeln('24 mod 12 = ',tf); writeln('123 mod 100 = ',tg); writeln('200 mod 100 = ',th); end;
        else writeln('Letra invalida');
        end;
        writeln;
        write('Digite "si" para salir: ');
        readln(salir);
        end;
        until salir='si';
end.
