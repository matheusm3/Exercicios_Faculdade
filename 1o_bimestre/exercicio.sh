#!/bin/bash
newyork="https://github.com/leandersonandre/shell-script/blob/master/newyork.tar.gz?raw=true" 
lisbon="https://github.com/leandersonandre/shell-script/blob/master/london.tar.gz?raw=true" 
london="https://github.com/leandersonandre/shell-script/blob/master/london.tar.gz?raw=true"

echo “Banco Shell Script” 
echo “Informe seu nome” 
read name 
wget https://raw.githubusercontent.com/leandersonandre/shell-script/master/lista_usuarios.txt 
if [  $(grep -c $name lista-usuarios.txt) -ne 0 ]; 
then 	
	echo ”usuário encontrado”
	echo “baixando dados do usuário” 	
	wget $name 	
	tar -vzxf $name".tar.zip" 	
	echo “download completo”
	escolha=0
	while [ $y -ne 3]; do
		echo “Selecione uma opção” 	
		echo “1. Ver saldo;” 	
		echo “2. Ver extrato;”
		read opcao
		if [ $opcao -eq 1 ]
		then
			cat $name/saldo.txt
		elif [ $opcao -eq 2 ]
		then
			cat $name/extrato.txt
		fi
	done
	rm -r $name
else 	
	echo “usuário não encontrado”  
fi
