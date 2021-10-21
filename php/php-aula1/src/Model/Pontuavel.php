<?php

namespace Alura\Solid\Model;

interface Pontuavel {
    public function recuperaPontuacao(): int;
    public function assistir(): void;
}
