
my $fh= open 'input.txt';

say $fh.get;

for $fh.lines -> $line {
  my @n = $line.comb(/\d+/);
  say @n;
}
# my @numbers = @lines[1..*].map({+$_});

# say @numbers.sum;
