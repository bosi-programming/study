<?php

$conta1 = [
  'titular' => 'Vinicius',
  'saldo' => 1000
];
$conta2 = [
  'titular' => 'Maria',
  'saldo' => 10000
];

$conta3 = [
  'titular' => 'Alberto',
  'saldo' => 300
];
$contasCorrentes = [$conta1, $conta2, $conta3];

echo $contasCorrentes[0]['titular'] . PHP_EOL;
