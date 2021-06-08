/*
 * Copyright 2019 Algorand, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.algorand.android.ui.addasset

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.algorand.android.databinding.ItemSearchAssetBinding
import com.algorand.android.models.AssetQueryItem

class AssetSearchItemViewHolder(private val binding: ItemSearchAssetBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(assetQueryItem: AssetQueryItem?) {
        binding.nameTextView.setupUI(
            showVerified = assetQueryItem?.isVerified,
            shortName = assetQueryItem?.shortName,
            fullName = assetQueryItem?.fullName,
            assetId = assetQueryItem?.assetId,
            isAlgorand = false
        )
        binding.idTextView.text = assetQueryItem?.assetId.toString()
    }

    companion object {
        fun create(parent: ViewGroup): AssetSearchItemViewHolder {
            val binding = ItemSearchAssetBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return AssetSearchItemViewHolder(binding)
        }
    }
}
