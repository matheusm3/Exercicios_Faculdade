#comandos_linux
1. Utilize o comando echo para imprimir seu nome no terminal.
```bash
echo "Matheus Menezes da Costa"
```

2. Utilize o comando echo para salvar seu nome em um arquivo chamado cliente01.txt. Confira o resultado com o comando less.
```bash
echo "Matheus Menezes da Costa" > cliente01.txt
less cliente01.txt
```

3. Utilize o comando echo para salvar o nome da cidade em que você nasceu no final do arquivo cliente01.txt.
```bash
echo "Sao Bento do Sul" >> cliente01.txt
```

4. Crie um novo diretório chamado clientes com o comando mkdir. Confira o resultado com o comando ls.
```bash
mkdir clientes
ls
```

5. Mova o arquivo cliente01.txt para o diretório clientes. Confira o resultado com os comandos ls e cd.
```bash
mv cliente01.txt clientes/cliente01.txt
ls
cd clientes
```

6. Crie uma cópia do arquivo cliente01.txt com o comando cp chamado cliente01.txt.bkp. Confira o resultado.
```bash
cp cliente01.txt cliente01.txt.bkp
ls
cat cliente01.txt.bkp
```

7. Remova o arquivo cliente01.txt com o comando rm. Confira o resultado.
```bash
rm cliente01.txt
ls
```

8. Crie um arquivo chamado de cliente.script com todos os comandos utilizados acima, na mesma ordem de execução.
```bash
touch cliente.script
vi cliente.script
~echo "Matheus Menezes da Costa" > cliente.script
~less cliente.script
~echo "Sao Bento do Sul" >> cliente.script
~mkdir clientes
~cd clientes
~cp cliente01.txt cliente01.txt.bkp
~ls
~cat cliente01.txt.bkp
~rm cliente01.txt
~ls
:wq
```

9. Modifique o arquivo cliente.script com o comando chmod para se tornar um arquivo executável. Execute o arquivo e confira o resultado. Para executar utilize o comando ./cliente.script. Obs: exclua a pasta clientes antes de executar o script para garantir que está funcionando corretamente.
```bash
chmod 777 cliente.script
rmdir clientes
./cliente.script
```

10. Execute o comando cal. Observe o resultado. Execute o comando echo|cal > hoje.txt. Utilize o comandos ls e less para conferir o resultado. O que ocorreu? Qual a função do operador — ?
```
R: Inserir o calendário do mês atual em um arquivo de texto. a função do "-" é executar uma regra com o comando "cal".
```
```bash
echo | cal > hoje.txt
ls
less hoje.txt
```

11. Utilize o comando wget para baixar o arquivo cidades_sc.txt no endereço https://gist.githubusercontent.com/leandersonandre/c8cba982f42262591be628e5397d1c3f/raw/bd13a3e13823708e477f99f9285f845b292714c6/cidades_sc.txt.
```bash
wget https://gist.githubusercontent.com/leandersonandre/c8cba982f42262591be628e5397d1c3f/raw/bd13a3e13823708e477f99f9285f845b292714c6/cidades_sc.txt
```

12. Execute o comando grep Balneario cidades_sc.txt. Qual é o resultado?
```
R: O conteúdo o arquivo para exibir apenas resultados constando a palavra "Balneario" em sua composição. 
```
```bash
grep Balneario cidades_sc.txt

Balneario Arroio do Silva
Balneario Barra do Sul
Balneario Camboriu
Balneario Gaivota
```

13. Execute o comando grep balneario cidades_sc.txt. Qual é o resultado?
```
R: Não houve resultados, por "bauneario" estar com a letra minúscula.
```
```bash
grep balneario cidades_sc.txt
```

14. Execute o comando grep ”do Sul”cidades_sc.txt. Qual é o resultado?
```bash
grep "do Sul" cidades_sc.txt

Balneario Barra do Sul
Bocaina do Sul
Campo Belo do Sul
Caxambu do Sul
Cocal do Sul
Formosa do Sul
Guaruja do Sul
Jaragua do Sul
Lindoia do Sul
Rio do Sul
Santa Rosa do Sul
Santiago do Sul
Sao Bento do Sul
Sao Cristovao do Sul
Sao Francisco do Sul
Sao Joao do Sul
Timbe do Sul
```

15. Utilize os comandos cat e grep para filtrar as cidades que começam com o nome Balneario.
```bash
cat cidades_sc.txt | grep Balneario
```

16. Crie um arquivo chamado balneario.txt com o conteúdo filtrado no problema 15.
```bash
cat cidades_sc.txt | grep Balneario > balneario.txt
```

17. Compacte o arquivo balneario.txt, nomeando de compactado.tar com o comando tar.
```bash
tar compactado.tar balneario.txt
```

18. Descompacte o arquivo compactado.tar com o comando tar.
```bash
tar compactado.tar
```
