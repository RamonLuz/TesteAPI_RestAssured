# language: pt

Funcionalidade: Buscar usuários por id

Cenário: Buscar usuários por id
  Quando eu busco o get 1
  Então o status code deve ser 200
  E o id retornado deve ser 1
  
Cenário: Buscar usuários por id 
  Quando eu busco o get "10"
  Então o status code deve ser 200
  E o id retornado deve ser 10
  
Cenário: Buscar usuários por id nao encontrado
  Quando eu busco o get 99
  Então o status code deve ser 404
  
Cenário: Buscar usuários por id invalido 
  Quando eu busco o get "dez"
  Então o status code deve ser 404