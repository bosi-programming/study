<?php

namespace App\Http\Controllers;

use App\Models\Chat as ModelsChat;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Validator;

class Chat extends Controller
{
    public function get(Request $request)
    {
        return ModelsChat::find($request->id);
    }

    public function getAll(Request $request)
    {
        return ModelsChat::all();
    }

    public function create(Request $request)
    {
        $validator = Validator::make($request->all(), [
            'name' => 'required|string|max:255',
        ]);

        if ($validator->fails()) {
            return response()->json($validator->errors()->toJson(), 400);
        }

        $chat = ModelsChat::create([
            'name' => $request->get('name'),
        ]);

        return response()->json($chat, 201);
    }

    public function update(Request $request)
    {
        $validator = Validator::make($request->all(), [
            'name' => 'required|string|max:255',
        ]);

        if ($validator->fails()) {
            return response()->json($validator->errors()->toJson(), 400);
        }

        $chat = ModelsChat::find($request->id);
        $chat->name =  $request->get('name');
        $chat->save();

        return response()->json($chat);
    }

    public function delete(Request $request)
    {
        $chat = ModelsChat::find($request->id);
        $chat->delete();
        return response(null, 200);
    }
}
