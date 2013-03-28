#!/bin/sh

kdestroy
echo SUASENHA | kinit SEUUSUARIO
net ads keytab flush -U SEUUSUARIO%"SUASENHA"
net ads keytab add HTTP -U SEUUSUARIO%"SUASENHA"