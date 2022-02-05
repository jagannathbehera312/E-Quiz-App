package com.inspireclubnitrkl.e_quiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.inspireclubnitrkl.e_quiz.databinding.RowLeaderboardsBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class LeaderBoardAdapter extends RecyclerView.Adapter<LeaderBoardAdapter.LeaderBoardViewHolder>{

    Context context;
    ArrayList<User> users;

    public LeaderBoardAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @NotNull
    @Override
    public LeaderBoardViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_leaderboards,parent,false);
        return new LeaderBoardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull LeaderBoardViewHolder holder, int position) {

            User user =  users.get(position);

            holder.binding.name.setText(user.getName());
            holder.binding.coins.setText(String.valueOf(user.getCoins()));
            holder.binding.index.setText(String.format("#%d",position+1));

        Glide.with(context)
                .load(user.getProfile())
                .into(holder.binding.imageView8);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class LeaderBoardViewHolder extends RecyclerView.ViewHolder{

        RowLeaderboardsBinding binding;

        public LeaderBoardViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            binding = RowLeaderboardsBinding.bind(itemView);
        }
    }
}
