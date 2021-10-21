<?php

namespace Alura\Solid\Service;

use Alura\Solid\Model\Pontuavel;

class Assistidor
{
    public function assisteCurso(Pontuavel $conteudo)
    {
        $conteudo->assistir();
    }
}
