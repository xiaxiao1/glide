package com.bumptech.glide.load.resource.drawable;

import com.bumptech.glide.Resource;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.model.ImageVideoWrapper;

import java.io.IOException;
import java.io.InputStream;

public class GifBitmapStreamResourceDecoder implements ResourceDecoder<InputStream, GifBitmap>{
    private ResourceDecoder<ImageVideoWrapper, GifBitmap> gifBitmapDecoder;

    public GifBitmapStreamResourceDecoder(ResourceDecoder<ImageVideoWrapper, GifBitmap> gifBitmapDecoder) {
        this.gifBitmapDecoder = gifBitmapDecoder;
    }

    @Override
    public Resource<GifBitmap> decode(InputStream source, int width, int height) throws IOException {
        return gifBitmapDecoder.decode(new ImageVideoWrapper(source, null), width, height);
    }

    @Override
    public String getId() {
        return "GifBitmapStreamResourceDecoder.com.bumptech.glide.resource.drawable";
    }
}
