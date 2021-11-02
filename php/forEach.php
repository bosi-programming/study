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

$contasCorrentes[] = [
  'titular' => 'Dania',
  'saldo' => 1293
];

foreach ($contasCorrentes as $conta) {
  foreach ($conta as $field => $dado) {
    echo $field . '=>' . $dado . PHP_EOL;
  };
};
