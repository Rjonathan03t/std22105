package com.secu.demo.file.hash;

import com.secu.demo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
