<?php

function exibeMensagem (string $mensagem) {
  echo $mensagem . '<br>';
}

function depositar(array $conta, float $valor): array {
  if ($valor > 0) {
    $conta['saldo'] += $valor;
  } else {
    exibeMensagem('Valor de deposito deve ser positivo');
  }
  return $conta;
}

function titularComLetrasMaiusculas(array &$conta) {
  $conta['titular'] = mb_strtoupper($conta['titular']);
}
