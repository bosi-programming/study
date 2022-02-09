<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;
use Illuminate\Support\Str;
use App\Models\User;
use App\Models\Chat;

class DatabaseSeeder extends Seeder
{
    /**
     * Seed the application's database.
     *
     * @return void
     */
    public function run()
    {
        $this->addUsers();
        $this->addChats();
        $this->addMessages();
    }

    private function addUsers()
    {
        for ($i = 0; $i <= 1; $i++) {
            DB::table('users')->insert([
                'name' => 'user' . $i,
                'email' => 'user' . $i . '@gmail.com',
                'password' => Hash::make('password'),
            ]);
        }
    }

    private function addChats()
    {
        for ($i = 0; $i <= 1; $i++) {
            DB::table('chats')->insert([
                'name' => 'chat ' . $i,
            ]);
        }
    }

    private function addMessages()
    {
        for ($i = 0; $i <= 1; $i++) {
            DB::table('messages')->insert([
                'message' => 'hello',
                'user_id' => User::all()->get(0)->id,
                'chat_id' => Chat::all()->get($i)->id,
            ]);

            DB::table('messages')->insert([
                'message' => 'how are you',
                'user_id' => User::all()->get(1)->id,
                'chat_id' => Chat::all()->get($i)->id
            ]);
        }
    }
}
