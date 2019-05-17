#shell_scripts
1. Crie um script que solicite ao usuário digitar o seu nome e imprime o conteúdo no terminal.
```bash
touch bom_dia.sh
chmod 777 bom_dia.sh
vi bom_dia.sh
~#!/bin/bash
~echo “digite seu nome” 
~read nome
~echo “bom dia $nome”
:wq
```

2. Crie um script que multiplica dois números que o usuário informar.
```bash
touch mult.sh
chmod 777 mult.sh
vi mult.sh
~#!/bin/bash
~echo “digite o primeiro numero” 
~read num1
~echo “digite o segundo numero”
~read num2
~num3=$[num1 * num2]
~echo “$num3”
:wq
```

3. Crie um script que identifique se o usuário informou um número positivo, negativo ou zero. 
```bash
touch escolha.sh
chmod 777 escolha.sh
vi escolha.sh
~#!/bin/bash
~echo “digite um numero” 
~read num
~if [ $num -gt 0 ];
~then
~	echo “positivo”
~fi
~if [ $num -lt 0 ];
~then
~	echo “negativo”
~fi
~if [ $num -eq 0 ];
~then
~	echo “numero zero”
~fi
:wq
```

4. Crie um script resolva a tabuada do número informado pelo usuário.
```bash
touch tabuada.sh
chmod 777 tabuada.sh
vi tabuada.sh
~#!/bin/bash
~echo “digite um numero” 
~read n
~for((c=1;c<=10;c++)); do
~	result=$[c * n]
~	echo “$c * $n = $result”
~done
:wq
```

5. Crie um script que apresente duas opções ao usuário. A primeira opção deverá mostrar o calendário. A segunda opção deve mostrar a lista de arquivos do diretório.
```bash
touch cal_ls.sh
chmod 777 cal_ls.sh
vi cal_ls.sh
~#!/bin/bash
~echo “Opcoes:”
~echo “_______”
~echo “1 - Calendário”
~echo “2 - Diretórios”
~echo “_______” 
~read opcao
~if [ $opcao -eq 1]
~then
~	echo “mostrar calendario”
~	cal
~else
~	echo “mostrar arquivos e diretorios”
~	ls -l
~fi
:wq
```